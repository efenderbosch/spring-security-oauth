package org.springframework.security.oauth2.common.exceptions;

/**
 * @author Ryan Heaton
 */
public class InvalidGrantException extends ClientAuthenticationException {

  public InvalidGrantException(String msg, Throwable t) {
    super(msg, t);
  }

  public InvalidGrantException(String msg) {
    super(msg);
  }

  public InvalidGrantException(String msg, Object extraInformation) {
    super(msg, extraInformation);
  }

  @Override
  public String getOAuth2ErrorCode() {
    return "invalid_grant";
  }
}