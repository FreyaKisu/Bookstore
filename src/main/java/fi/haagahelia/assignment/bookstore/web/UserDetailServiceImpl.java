package fi.haagahelia.assignment.bookstore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserDetailServiceImpl implements UserDetailsService  {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {   
    	if ("user".equals(username)) {
    		/*return user details for "user"*/
    		return new User(
    				username,
    				"$2a$10$tpSY36Uyz0/sUkRh1QXXKe/kWBLXy3/C4STkwVBkS.rAcAiE9dLDO", 
            		AuthorityUtils.createAuthorityList("USER"));
    	}
    	if ("admin".equals(username)) {
    		/*return user details for "admin"*/
    		return new User(
    				username,
    				"$2a$10$JlXYvZ.r4N518JfBaq.5KOPOHTvzZ9sTPMD1O..h2e2zam4mK3GWe", 
            		AuthorityUtils.createAuthorityList("ADMIN"));
    	}
    	return null;
    }   
}
