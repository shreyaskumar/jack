
/**
 * Autogenerated by Jack
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.rapleaf.jack.test_project.database_1.iface;

import com.rapleaf.jack.test_project.database_1.models.Post;
import com.rapleaf.jack.test_project.database_1.query.PostQueryBuilder;
import com.rapleaf.jack.test_project.database_1.query.PostDeleteBuilder;

import java.io.IOException;
import java.util.Map;
import java.util.List;

import com.rapleaf.jack.IModelPersistence;

public interface IPostPersistence extends IModelPersistence<Post> {
  Post create(final String title, final Long posted_at_millis, final Integer user_id, final Long updated_at) throws IOException;
  Post create() throws IOException;

  Post createDefaultInstance() throws IOException;
  List<Post> findByTitle(String value)  throws IOException;
  List<Post> findByPostedAtMillis(Long value)  throws IOException;
  List<Post> findByUserId(Integer value)  throws IOException;
  List<Post> findByUpdatedAt(Long value)  throws IOException;

  PostQueryBuilder query();

  PostDeleteBuilder delete();
}
