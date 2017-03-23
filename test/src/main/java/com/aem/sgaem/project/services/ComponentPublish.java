package com.aem.sgaem.project.services;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.ConfigurationPolicy;
import org.apache.felix.scr.annotations.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(label = "SGAEM - OSGi Configuration for Publish Run Mode", immediate = true, policy = ConfigurationPolicy.REQUIRE)
@Service(ComponentPublish.class)
public class ComponentPublish {

  private static final Logger LOGGER = LoggerFactory.getLogger(ComponentPublish.class);

  @Activate
  protected void activate() {
    LOGGER.debug("Run Modes Activated");
  }
}

