package dgsw.b1cami.cocode.Service;

import dgsw.b1cami.cocode.Domain.Post;
import dgsw.b1cami.cocode.json.PostResponse;
import dgsw.b1cami.cocode.json.Response;

public interface PostService {

    Response uploadPost(Post post);

    PostResponse getPost(Integer postId);

}