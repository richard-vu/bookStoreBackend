/**
 * @Nickname: Richard
 * @Email: richardvu.work@gmail.com
 * @Skype: richardvu.work@gmail.com
 * @Phone: (+84) 0935710974 - (+84) 0935810974
 * @Country: Viet Nam
 * @Year: 2021
 * @LICENSE: DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 */
package com.richard.application.configurations;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mx-linux
 */
@Controller
public class HomeController {

  /**
   * HomeController index
   *
   * @return
   */
  @RequestMapping(value = "/")
  public String index() {
    System.out.println("swagger-ui.html");
    return "redirect:swagger-ui.html";
  }

}