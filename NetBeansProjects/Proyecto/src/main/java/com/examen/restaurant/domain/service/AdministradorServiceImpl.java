package com.examen.restaurant.domain.service;

import com.examen.restaurant.domain.repository.AdministradorRepository;
import com.examen.restaurant.persistence.DTO.AdministradorDTO;
import com.examen.restaurant.persistence.DTO.LoginDTO;
import com.examen.restaurant.persistence.DTO.ShowAdministradorDTO;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class AdministradorServiceImpl implements AdministradorService {
    
    private final AdministradorRepository administradorRepository; 
    
    public AdministradorServiceImpl(AdministradorRepository administradorRepository) {
        this.administradorRepository = administradorRepository; 
    }

    @Override
    @Transactional
    public AdministradorDTO crearAdministrador(AdministradorDTO administradorDTO) {
//        Administrador administrador = new Administrador(); 
//        administrador.setIdAdministrador(administradorDTO.);
          throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    @Transactional
    public void desactivarAdministrador(String email) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    @Transactional
    public LoginDTO loginAdministrador(String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    @Transactional
    public ShowAdministradorDTO getAdministradorByEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
//     @Override
//    @Transactional
//    public UserDTO createUser(UserCreateDTO userCreateDTO) {
//        if (userRepository.existsByEmail(userCreateDTO.getEmail())) {
//            throw new UniqueViolationException("This email is already registered.");
//        }
//        if (userRepository.existsByUsername(userCreateDTO.getUsername())) {
//            throw new UniqueViolationException("This username is already registered");
//        }
//        
//        User user = new User();
//        user.setName(userCreateDTO.getName());
//        user.setEmail(userCreateDTO.getEmail()); 
//        user.setUsername(userCreateDTO.getUsername()); 
//        user.setPassword(passwordEncoder.encode(userCreateDTO.getPassword()));
//        user.setBirthdate(userCreateDTO.getBirthdate());
//        user.setCreationDate(LocalDateTime.now());
//        user.setIsActive(true); 
//        user.setIsPrivate(false);
//        user.setPhoto("https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/65761296352685.5eac4787a4720.jpg");
//        
//        User saveUser = userRepository.save(user); 
//        return toUserDTO(saveUser); 
//    }
//    
//    @Override
//    @Transactional
//    public UserDTO getUserByEmail(String email) {
//        if (email == null || email.trim().isEmpty()) {
//            throw new InvalidInputException("Email cannot be null or empty.");
//        }
//        User user = userRepository.findByEmail(email);
//        if (user == null) {
//            throw new NotFoundException("User not found with email: " + email);
//        }
//        return user.getIsActive() ? toUserDTO(user) : null; 
//    }
//
//    @Override
//    @Transactional
//    public List<UserDTO> getAllUsers() {
//        List<User> users = userRepository.findAll(); 
//        if (users.isEmpty()) {
//            return Collections.emptyList();
//        }
//        return users.stream()
//                .map(this::toUserDTO)
//                .filter(userDTO -> userDTO.getIsActive())
//                .collect(Collectors.toList());
//    }
//    
//    @Override
//    @Transactional
//    public void changePassword(String email, String currentPassword, String newPassword) {
//        if (email == null || email.trim().isEmpty()) {
//            throw new InvalidInputException("Email cannot be null or empty.");
//        }
//        User user = userRepository.findByEmail(email);
//        if (user == null) {
//            throw new NotFoundException("User not found with email: " + email);
//        }
//        if (!passwordEncoder.matches(currentPassword, user.getPassword())) {
//            throw new InvalidInputException("Current password is incorrect.");
//        }
//        user.setPassword(passwordEncoder.encode(newPassword));
//        userRepository.save(user); 
//    }
//
//    @Override
//    @Transactional
//    public void changeStatus(String email, Boolean isActive) {
//        if (email == null || email.trim().isEmpty()) {
//            throw new InvalidInputException("Email cannot be null or empty.");
//        }
//        User user = userRepository.findByEmail(email);
//        if (user == null) {
//            throw new NotFoundException("User not found with email: " + email);
//        }
//        user.setIsActive(isActive);
//        userRepository.save(user); 
//    }
//    
//    @Override
//    @Transactional
//    public void changePrivacy(String email, Boolean isPrivate) {
//        if (email == null || email.trim().isEmpty()) {
//            throw new InvalidInputException("Email cannot be null or empty.");
//        }
//        User user = userRepository.findByEmail(email);
//        if (user == null) {
//            throw new NotFoundException("User not found with email: " + email);
//        }
//        user.setIsPrivate(isPrivate);
//        userRepository.save(user); 
//    }
//    
//    @Override
//    @Transactional
//    public List<UserDTO> searchUsers(String keyword) {
//        if (keyword == null || keyword.trim().isEmpty()) {
//            throw new InvalidInputException("Keyword cannot be null or empty.");
//        }
//        List<User> users = userRepository.findByUsernameContainingOrEmailContaining(keyword, keyword);
//        if (users.isEmpty()) {
//            return Collections.emptyList();
//        }
//        return users.stream()
//                .map(this::toUserDTO)
//                .filter(userDTO -> userDTO.getIsActive())
//                .collect(Collectors.toList());
//    }
//    
//    @Override
//    @Transactional
//    public LoginDTO userLogin(String email, String password) {
//        if (email == null || email.trim().isEmpty() || password == null || password.trim().isEmpty()) {
//            throw new InvalidInputException("Email and password cannot be null or empty.");
//        }
//        User user = userRepository.findByEmail(email);
//        if (user == null) {
//            throw new NotFoundException("User not found with email: " + email);
//        }
//        if (passwordEncoder.matches(password, user.getPassword())) {
//            String token = jwtAuthtenticationConfig.getJWTToken(email);
//            return new LoginDTO(email, token); 
//        } else {
//            throw new InvalidInputException("Incorrect password.");
//        }
//    }
//    
//    public User toUser(UserDTO userDTO) {
//        User user = new User(); 
//        user.setIdUser(userDTO.getIdUser());
//        user.setName(userDTO.getName()); 
//        user.setEmail(userDTO.getEmail());
//        user.setUsername(userDTO.getUsername());
//        user.setBiography(userDTO.getBiography());
//        user.setBirthdate(userDTO.getBirthdate());
//        user.setCreationDate(userDTO.getCreationDate());
//        user.setLastUpdate(userDTO.getLastUpdate());
//        user.setIsActive(userDTO.getIsActive());
//        user.setIsPrivate(userDTO.getIsPrivate());
//        user.setPhoto(userDTO.getPhoto());
//        return user; 
//    }
//   
//    public UserDTO toUserDTO(User user) {
//        UserDTO userDTO = new UserDTO();
//        userDTO.setIdUser(user.getIdUser());
//        userDTO.setName(user.getName()); 
//        userDTO.setEmail(user.getEmail());
//        userDTO.setUsername(user.getUsername());
//        userDTO.setBiography(user.getBiography());
//        userDTO.setBirthdate(user.getBirthdate());
//        userDTO.setCreationDate(user.getCreationDate());
//        userDTO.setLastUpdate(user.getLastUpdate());
//        userDTO.setIsActive(user.getIsActive());
//        userDTO.setIsPrivate(user.getIsPrivate());
//        userDTO.setPhoto(user.getPhoto());
//        return userDTO; 
//    }
//    
//    public Boolean existsByUsername(String username) {
//        return userRepository.existsByUsername(username); 
//    }
//    
//    public Boolean existsByEmail(String email) {
//        return userRepository.existsByEmail(email); 
//    }
//    
//    public User getUserEntity(String email) {
//        return userRepository.findByEmail(email);
//    }
//    
//    public UserDTO saveUser(User user) {
//        User userSave = userRepository.save(user); 
//        return toUserDTO(userSave);
//    }
//    
//    public User getUserAndActive(Long idUser) {
//        return userRepository.findByIdUserAndIsActiveTrue(idUser); 
//    }
//    
//    public User getUserByEmailAndActive(String email) {
//        return userRepository.findByEmailAndIsActiveTrue(email); 
//    }
//    
//    public User getUserById(Long idUser) {
//        return userRepository.findById(idUser)
//                .orElseThrow(() -> new RuntimeException("Not found"));
//    }
//    
//    public List<Long> getNotFollowedUsersId(Long idUser, List<Long> followedUsersId) {
//        return userRepository.findNotFollowedUsersId(idUser, followedUsersId);
//    }
//    
//    public List<Long> getNotFollowedUsersEmail(String emailUser, List<Long> followedUsersId) {
//        return userRepository.findNotFollowedUsersByEmail(emailUser, followedUsersId);
//    }
//    
//    public User getUserByEmailEntity(String email) {
//        return userRepository.findByEmail(email);
//    }
//
//  
//}

 
    
}
