package com.example.littlebobbiesshop;

import lombok.Data;
import lombok.Value;

@Value
public class SearchResult {
  Long id;
  String artikelName;
  Integer preis;
}
