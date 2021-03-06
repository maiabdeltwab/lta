package com.fym.lta.BAO;

import com.fym.lta.DTO.EmployeeDto;
import com.fym.lta.DTO.StaffDto;
import com.fym.lta.DTO.UserDto;

import java.util.List;

public abstract interface UserBao {

    /**use to check if the last user logged in program saved his login or not
     * @return the last logged in user
     * */
    public abstract UserDto Keeplogin();

    /** used to save the last user logged in
     * save user id and his choice to keep his login or not
     * @param logged in user
     * */
    public abstract void savelogin(UserDto u);

    /** Method to view all exist users
     * @param no parameters
     * @return list of users objects */
    public abstract List<UserDto> viewAll();

    /** Create a new user account
     * @param takes user object inserted by anthor user
     * @Return true for if it success, False if not */
    public abstract boolean add(UserDto u, UserDto user);

    /** Delete user account.
     * Takes the object and return true if it has deleted and false if any exception occur*/
    public abstract boolean delete(UserDto user);

    /** Search For user account with any attributes of it(id,name,code,...)
     * This method takes user object and return list of users if exist.
     */
    public abstract List<UserDto> searchFor(UserDto user);

    /** update an existed one
     * @param takes user object inserted by user
     * @Return true for if it success, False if not */
    public abstract boolean update(UserDto u, UserDto user);

    /** used for login
     * open database connection
     * @param take user object with entered username/email and password
     * @return it with other needed data (if user found in database)
     */
    public abstract UserDto login(UserDto user);

    /** used for loginout
     *  close database connection
     * @param take user object with entered username/email and password
     * @return it with other needed data (if user found in database)
     */
    public abstract void closeConnection(UserDto user);


    /**Method to get user staff
     * @param take user dto
     * @return user's staff (if exist)
     * */
    public abstract StaffDto getStaff(UserDto user);

    /**Method to get user employee
     * @param take user dto
     * @return user's employee (if exist)
     * */
    public abstract EmployeeDto getEmployee(UserDto user);

    /**Check if user existing in database or not
     * @param take user
     * @return true if exist, false if not*/
    public abstract boolean isExist(UserDto user);

    /**get user ID
     * @param take user account
     * @return ID
     * */
    public abstract int getId(UserDto user);

    /**get the max user ID
     * @retrun Id
     * **/
    public abstract int calcMaxId();

    /**Use to user setting panel
     * update user info.
     * @param take user dto
     * @return it after update
     * */
    public abstract UserDto userSetting(UserDto user);


}
