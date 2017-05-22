package com.technovalley21.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.FileOutputStream;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

@Controller
@RequestMapping("/MailSender")
public class MailSenderController {
	
	@Autowired
	private JavaMailSenderImpl mailSender;
	
	@RequestMapping(value = "/compose", method=RequestMethod.GET)
	public ModelAndView mailComposer(){
		ModelAndView mav = new ModelAndView("mailComposer");
		
		return mav;
	}
	
	public static File getFile(MultipartFile file)
	{
		File convFile = new File(file.getOriginalFilename());
		try{
			
		    convFile.createNewFile(); 
		    FileOutputStream fos = new FileOutputStream(convFile); 
		    fos.write(file.getBytes());
		    fos.close(); 
		    return convFile;
		} catch(Exception ex){
			ex.printStackTrace();
		}
	    return convFile;
	}
	
	@RequestMapping(value = "/sendMail.html", method=RequestMethod.POST)
	public String mailSending(final @RequestParam("imgFile") MultipartFile imgFile){
		
		try {
			MimeMessage mimeMessage = mailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
			String htmlMsg = "<b>Dear test user,</b><br />";
			htmlMsg += "We are very glad inform you that this is test <h3>EMAIL</h3>";
			htmlMsg += System.lineSeparator();
			htmlMsg += "<b>Thanks</b><br />";
			htmlMsg += "Md. Shahadat Sarker";
			
			mimeMessage.setContent(htmlMsg, "text/html");
			
			/*File file = getFile(imgFile);
			helper.addAttachment(imgFile.getOriginalFilename(),  file);*/
			
			try{
				File testFile = new File("d:/apple.png");
				if( testFile.exists() ){
					FileSystemResource file = new FileSystemResource(testFile);
					helper.addAttachment("apple.png", file);
				} else{
					System.out.println("File not found....");
				}
				
			} catch(Exception ep){
				ep.printStackTrace();
			}
			
			
			
			helper.setTo("shahadat@iecl-bd.net");
			helper.setSubject("Spring mail with attachment");
			helper.setFrom("shahadat@iecl-bd.net");
			mailSender.send(mimeMessage);
			
			System.out.println("Mail sent....");
			
		} catch (Exception e) {
			System.err.println("EXCEPTION");
			e.printStackTrace();
		}
		
		return "redirect:/MailSender/compose";
	}
	
}
