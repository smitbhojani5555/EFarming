package com.controller;
 
import javax.servlet.http.HttpServletRequest;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.services.FileUploadService;
import com.table.TblUser;
 
/**
 * Handles requests for the file upload page.
 */
@Controller
public class FileController {
    @Autowired
    private FileUploadService fileUploadService;
 
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showUploadForm(HttpServletRequest request) {
        return "Upload";
    }
     
    @RequestMapping("doUpload.htm")
    public String handleFileUpload(HttpServletRequest request,
            @RequestParam CommonsMultipartFile[] fileUpload) throws Exception {
          
        if (fileUpload != null && fileUpload.length > 0) {
            for (CommonsMultipartFile aFile : fileUpload){
                  
                System.out.println("Saving file: " + aFile.getOriginalFilename());
                 
                TblUser uploadFile = new TblUser();
                
                uploadFile.setData(aFile.getBytes());
                fileUploadService.save(uploadFile);               
            }
        }
  
        return "Success";
    }  
}