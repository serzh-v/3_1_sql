package com.mycompany.sql;

/**
 *
 * @author Dell
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println(formSql("12", "4"));
    }
    
    private static String formSql(String groupId, String dolgCount) {
        return  "INSERT INTO T_GroupSelected (id_Student, firstName, lastName, id_Group) " +
                "SELECT (id_Student, firstName, lastName, id_Group) " +
                "FROM T_Student " +
                "WHERE T_Student.id_Group = '" + groupId + "' " +
                " AND dolgCount > '" + dolgCount + "';";    
    }
}
