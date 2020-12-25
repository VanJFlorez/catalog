package com.theismaels.catalog;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogController {
  
  @GetMapping("/all")
  public Map<String, String> getSomething() {
    HashMap<String, String> hm = new HashMap<>();
    hm.put("itemKind", "polvora");
    hm.put("price", "200$");
    hm.put("qtty", "12");
    return hm;
  }

}
