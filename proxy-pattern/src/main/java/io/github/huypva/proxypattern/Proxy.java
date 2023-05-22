package io.github.huypva.proxypattern;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author huypva
 */
@Slf4j
@AllArgsConstructor
public class Proxy implements Subject {

  private Subject realSubject;

  @Override
  public void doAction() {
    log.info("Proxy doAction.");
    realSubject.doAction();
  }
}
