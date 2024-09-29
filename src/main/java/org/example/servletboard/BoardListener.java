package org.example.servletboard;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import java.util.ArrayList;
import java.util.List;

public class BoardListener implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    List<BoardDTO> list = new ArrayList<>();
    

  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {

  }
}
