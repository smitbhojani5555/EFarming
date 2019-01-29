package com.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.services.ImageService;

import sun.misc.IOUtils;

@Controller
public class ImageController {
	@Autowired
	private ImageService imageService;

	@RequestMapping("productimage.htm")
	public ModelAndView redirect(HttpServletRequest request, HttpServletResponse response) throws IOException {
		ModelAndView mv = new ModelAndView();
		String productname = request.getParameter("productname");

		List<Object> productList = imageService.listimage(productname);
		byte[] image = (byte[]) productList.get(0);

		response.setContentType("image");
		response.setBufferSize(image.length);
		response.setContentLength(image.length);
		InputStream in = new ByteArrayInputStream(image);

		OutputStream out = response.getOutputStream();
		try {
			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
			out.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
      
		return null;
	}

}
