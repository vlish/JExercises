package com.softserveinc.ita.jexercises.common.mapper;

import com.softserveinc.ita.jexercises.common.dto.UserProfileDto;
import com.softserveinc.ita.jexercises.common.entity.User;
import org.springframework.stereotype.Component;

/**
 * Represents entity/DTO mapping tool.
 *
 * @author Taras Vuyiv
 */
@Component
public class UserProfileMapper {

    /**
     * Transforms UserProfileDto object into User entity object.
     *
     * @param userProfileDto UserProfile DTO.
     * @param user           User entity.
     * @return User entity.
     */
    public User toEntity(User user, UserProfileDto userProfileDto) {

        if (!userProfileDto.getLastName().isEmpty()) {
            user.setLastName(userProfileDto.getLastName());
        }

        if (!userProfileDto.getFirstName().isEmpty()) {
            user.setFirstName(userProfileDto.getFirstName());
        }

        if (!userProfileDto.getPassword().isEmpty()) {
            user.setPassword(userProfileDto.getPassword());
        }

        if (!userProfileDto.getAvatar().isEmpty()) {
            user.setAvatar(userProfileDto.getAvatar().getBytes());
        }

        if (userProfileDto.getRole() != null) {
            user.setRole(userProfileDto.getRole());
        }

        return user;
    }

    /**
     * Transforms User entity object into UserProfile DTO object.
     *
     * @param user User entity.
     * @return UserProfile DTO.
     */
    public UserProfileDto toDto(User user) {
        UserProfileDto userProfileDto = new UserProfileDto();
        if (user.getAvatar() != null) {
            userProfileDto.setAvatar(new String(user.getAvatar()));
        }
        userProfileDto.setEmail(user.getEmail());
        userProfileDto.setFirstName(user.getFirstName());
        userProfileDto.setLastName(user.getLastName());
        userProfileDto.setRegistrationDate(user.getCreatedDate());
        userProfileDto.setRole(user.getRole());
        userProfileDto.setBirthDate(user.getBirthDate());

        return userProfileDto;
    }
}
