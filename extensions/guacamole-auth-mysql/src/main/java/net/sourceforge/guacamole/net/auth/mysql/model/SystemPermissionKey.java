package net.sourceforge.guacamole.net.auth.mysql.model;

public class SystemPermissionKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guacamole..guacamole_system_permission.user_id
     *
     * @mbggenerated Tue Feb 19 23:09:22 PST 2013
     */
    private Integer user_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guacamole..guacamole_system_permission.permission
     *
     * @mbggenerated Tue Feb 19 23:09:22 PST 2013
     */
    private String permission;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guacamole..guacamole_system_permission.user_id
     *
     * @return the value of guacamole..guacamole_system_permission.user_id
     *
     * @mbggenerated Tue Feb 19 23:09:22 PST 2013
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guacamole..guacamole_system_permission.user_id
     *
     * @param user_id the value for guacamole..guacamole_system_permission.user_id
     *
     * @mbggenerated Tue Feb 19 23:09:22 PST 2013
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guacamole..guacamole_system_permission.permission
     *
     * @return the value of guacamole..guacamole_system_permission.permission
     *
     * @mbggenerated Tue Feb 19 23:09:22 PST 2013
     */
    public String getPermission() {
        return permission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guacamole..guacamole_system_permission.permission
     *
     * @param permission the value for guacamole..guacamole_system_permission.permission
     *
     * @mbggenerated Tue Feb 19 23:09:22 PST 2013
     */
    public void setPermission(String permission) {
        this.permission = permission;
    }
}