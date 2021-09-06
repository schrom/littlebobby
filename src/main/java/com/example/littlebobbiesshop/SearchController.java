package com.example.littlebobbiesshop;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class SearchController {

  final JdbcTemplate jdbcTemplate;

  @GetMapping("/")
  public String main(Model model) {
    model.addAttribute("query", "");
    return "search";
  }

  @PostMapping("/")
  public String doSearch(Model model, @RequestParam String query) {

    List<Map<String, Object>> results = jdbcTemplate.queryForList("SELECT id, name, preis FROM artikel WHERE name LIKE '%" + query + "%'");

    List<SearchResult> searchResults = results.stream()
        .map(row -> new SearchResult((Long) row.get("id"), (String) row.get("name"), (Integer) row.get("preis")))
        .collect(Collectors.toList());
    model.addAttribute("searchresults", searchResults);
    model.addAttribute("query", query);
    return "search";
  }

}
