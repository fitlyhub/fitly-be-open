/**
 * 
 */
package vn.fitly.iam.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import vn.fitly.domain.dto.BaseResponse;
import vn.fitly.iam.dto.UserResponse;

/**
 * 
 */
@Path("/iam/v1/users")
public class UserController {

    @GET
    @Path("/{id}")
    public BaseResponse<UserResponse> getUser(@PathParam("id") String id) throws Exception {
        // Rule: Strict Null Checking
        if (id == null || id.isBlank()) {
            throw new Exception("Bad Request: Missing path parameter 'id' for user lookup.");
        }

        UserResponse user = new UserResponse();
        user.setUsername("sfsdfdf");

        return BaseResponse.success(user);

    }
}
