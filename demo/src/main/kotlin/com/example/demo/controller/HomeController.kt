package com.example.demo.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.GetMapping
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Controller
class HomeController {
    @GetMapping("/")
    fun index(req: HttpServletRequest, res: HttpServletResponse, model: ModelMap) {
      val test = ""
    }
}