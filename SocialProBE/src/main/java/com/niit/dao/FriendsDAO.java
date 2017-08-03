package com.niit.dao;

import java.util.List;

import com.niit.model.Friends;
import com.niit.model.User;


public interface FriendsDAO {

	// add friend
	boolean addFriend(Friends friends);
	
	// update friend
	boolean updateFriend(Friends friends);
	
	// delete friend
	boolean deleteFriend(Friends friends);
	
	// get friend
	Friends getFriend(int id);
	
	// list of friends
	List<Friends> list();
	
	// list of friends by friend id
	List<Friends> list(int id);
	
	// list of friends by status
	List<Friends> list(String status);
	
	// list of user  for getting list of my friends 
	List<User> myFriends(int id);
	
	// list of user for getting list that has no  friends for me
	List<User> noFriends(int id);
	
	/*Friends getFriendsStatus(int initiatorId,int friendId);*/
	
}
