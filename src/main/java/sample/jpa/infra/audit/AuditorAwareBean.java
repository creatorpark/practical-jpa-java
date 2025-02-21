package sample.jpa.infra.audit;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class AuditorAwareBean implements AuditorAware<String> {
  
  public Optional<String> getCurrentAuditor() {
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    
    if ( !isAnonymous( authentication) ) {
      return Optional.of(authentication.getName());
    } else {
      return Optional.of("system");
    }
  }
  
  private boolean isAnonymous( Authentication authentication ) {
    if ( authentication == null ) return true;
    return authentication.getName().equals("anonymousUser");
  }
}
