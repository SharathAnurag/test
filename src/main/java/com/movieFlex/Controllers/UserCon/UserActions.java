package com.movieFlex.Controllers.UserCon;

import java.util.List;

import com.movieFlex.Exception.UserAlreadyExistsException;
import com.movieFlex.Exception.UserNotFoundException;
import com.movieFlex.Model.Pojos.User;
import com.movieFlex.Model.Pojos.UserLogin;

public interface UserActions {

	/**
	 * Get Users 
	 * Accepts the security packet
	 * return a list of users. 
	 *  /list
	 *  
	 */
	public List<User> getAllUsers();
	
	/**
	 * Get a specific user 
	 * given the email of the user we must be able to get a user from the database. It is conceptually 
	 * equal to the Login Function.
	 */
	public User getUser(UserLogin ur);
	
	/**
	 * Create a user 
	 * this accepts a object of type userRegistration, it then creates a user object and a login object.
	 * It returns the user object if successful  
	 * @throws UserAlreadyExistsException 
	 */
	public User createUser(User ur) throws UserAlreadyExistsException;
	
	/**
	 * Delete a user
	 * This function needs to delete a user, it accepts the users email
	 * it return the User object if successful 
	 */
	public void deleteUser(String email);
	
	public User updateUser(String email, User user) throws UserNotFoundException;
}
