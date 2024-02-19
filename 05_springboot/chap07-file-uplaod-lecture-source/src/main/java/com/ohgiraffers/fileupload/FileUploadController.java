package com.ohgiraffers.fileupload;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {
    @PostMapping("single-file")
    public String singleFileUpload(@RequestParam MultipartFile singleFile,
                                   @RequestParam String singleFileDescription) {

        /* 설명. encType = "multipart/form-data" 형태로 넘어온 파일은 MulitpartFile 타입으로 받게 됨  */ 
        System.out.println("singleFile = " + singleFile);
        System.out.println("singleFileDescription = " + singleFileDescription);
        
        /* 설명. build 경로의 static에 있는 파일 업로드 할 곳의 경로 받아오기 -> 미리 경로에 해당하는 디렉토리 생성 및 빌드 확인할 것 */ 

        return "redirect:/result";
    }
}
