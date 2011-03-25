/**
 * Autogenerated
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.rapleaf.java_active_record.test_project.database_1;

import java.sql.SQLException;
import java.sql.Statement;

import com.rapleaf.java_active_record.DbFixtures;
import com.rapleaf.java_active_record.DatabaseConnection;

public class BaseDatabase1Fixtures extends DbFixtures {

  static final DatabaseConnection db = new DatabaseConnection("database1");
  static final Statement stmt = db.getStatement();

  public static void setup() throws SQLException {
    stmt.execute(getTruncateTableStmt("comments"));
    stmt.execute(getTruncateTableStmt("followers"));
    stmt.execute(getTruncateTableStmt("images"));
    stmt.execute(getTruncateTableStmt("posts"));
    stmt.execute(getTruncateTableStmt("users"));
  }
}