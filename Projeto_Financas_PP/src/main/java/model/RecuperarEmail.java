package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

import daoJPA.UsuarioDaoJPA;
import dto.UsuarioDTO;

public class RecuperarEmail {
	private UsuarioDaoJPA dao;

	public RecuperarEmail() {
		dao = new UsuarioDaoJPA();
	}

	private boolean validaEmail(String email) {
		Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
		Matcher m = p.matcher(email);
		if (m.matches()) {
			return true;
		} else {
			return false;
		}
	}

	public void enviarEmail(UsuarioDTO dto) throws Exception {
		UsuarioDTO achado = null;
		String username = "vain.suporte@gmail.com";
		String password = "vaininvestimentos123";
		String assunto = "Recuperação de senha";

		if (validaEmail(dto.getEmail())) {
			achado = dao.buscarPorEmail(dto);
			
			String mensagemEmail = "Olá, aqui é do suport da Vain Investimentos. Sua senha recuperada é: "
					+ achado.getSenha();

			java.util.Properties props = new java.util.Properties();
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.socketFactory.port", "465");
			props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.port", "465");

			javax.mail.Session session = javax.mail.Session.getDefaultInstance(props, new javax.mail.Authenticator() {
				protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
					return new javax.mail.PasswordAuthentication(username, password);
				}
			});
			session.setDebug(true);

			try {

				javax.mail.Message message = new MimeMessage(session);
				message.setFrom(new InternetAddress(username)); // Remetente

				javax.mail.Address[] toUser = InternetAddress.parse(dto.getEmail());

				message.setRecipients(javax.mail.Message.RecipientType.TO, toUser);
				message.setSubject(assunto);// Assunto
				message.setText(mensagemEmail);
				javax.mail.Transport.send(message);
				JOptionPane.showMessageDialog(null, "Configura sua caixa de e-mail");
			} catch (MessagingException e) {
				throw new RuntimeException(e);
			}
		}

	}

}
