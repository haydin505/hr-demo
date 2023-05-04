package net.dialecticsoftware.hrdemo.exception;

/**
 * @author huseyinaydin
 */
public class NotFoundException extends Exception {

  public NotFoundException(Class clazz) {
    super("Entity not found. Entity class: " + clazz.getSimpleName());
  }
}
