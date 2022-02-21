package pl.ardas.springsecuritypractising.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.ardas.springsecuritypractising.model.User;
import pl.ardas.springsecuritypractising.repository.UserRepository;

import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<User> customer = userRepository.findByUsername(username);
        if(customer.size() == 0)
            throw new UsernameNotFoundException("User details not fount for the user: " + username);

        return new DetailedUser(customer.get(0));
    }
}
