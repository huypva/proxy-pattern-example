package io.github.huypva.proxypattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author huypva
 */
@Slf4j
public class RealSubject implements Subject{

  @Override
  public void doAction() {
    log.info("RealSubject doAction.");
  }
}
