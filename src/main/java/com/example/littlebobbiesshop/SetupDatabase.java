package com.example.littlebobbiesshop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.event.SpringApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequiredArgsConstructor
public class SetupDatabase {

  @Value("classpath:initdb.sql")
  private Resource sql;

  final JdbcTemplate jdbcTemplate;

  @EventListener(ApplicationReadyEvent.class)
  public void initdb() throws IOException {
    Files.lines(Path.of(sql.getURI()))
        .forEach(jdbcTemplate::execute);
  }

}
