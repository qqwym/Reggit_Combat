package com.reggit.demo.controller;



import com.reggit.demo.common.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.system.ApplicationHome;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@RestController
@RequestMapping("/common")
public class CommonControlle {

    @Autowired
    ResourceLoader resourceLoader;

    /**
     * 上传图片
     * @param multipartFile
     * @param request
     * @return
     * @throws IOException
     */
    @PostMapping("/upload")
    public R uploadPic(@RequestParam(value = "file") MultipartFile multipartFile, HttpServletRequest request) throws IOException {
        return null;
    }

    /**
     * 下载图片
     * @param request
     * @param response
     * @return
     * @throws IOException
     */
    @GetMapping("/download")
    public R downloadPic(HttpServletRequest request, HttpServletResponse response) throws IOException {
        return null;
    }
}


