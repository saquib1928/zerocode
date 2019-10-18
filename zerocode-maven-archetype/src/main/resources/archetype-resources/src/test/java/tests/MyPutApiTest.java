/**
 *
 * @author KristinSmith
 */

package ${groupId}.tests;

import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("hostconfig_ci.properties")
@RunWith(ZeroCodeUnitRunner.class)

public class MyPutApiTest {
     @Test
    @JsonTestCase("tests/post_api_200.json")
    public void testPost() throws Exception {

    }
}