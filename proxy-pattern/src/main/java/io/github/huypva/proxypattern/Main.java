package io.github.huypva.proxypattern;

/**
 * @author huypva
 */
public class Main {

  public static void main(String[] args) {
    Subject realSubject = new RealSubject();

    Subject subject = new Proxy(realSubject);
    subject.doAction();

  }
}
