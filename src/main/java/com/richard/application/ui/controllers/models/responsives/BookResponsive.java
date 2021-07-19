/**
 * @Nickname: Richard
 * @Email: richardvu.work@gmail.com
 * @Skype: richardvu.work@gmail.com
 * @Phone: (+84) 0935710974 - (+84) 0935810974
 * @Country: Viet Nam
 * @Year: 2021
 * @LICENSE: DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 */
package com.richard.application.ui.controllers.models.responsives;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mx-linux
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookResponsive implements Serializable{

  /** serialVersionUID: */
  private static final long serialVersionUID = 1L;
  
  /** title: */
  private String title;
  
}
