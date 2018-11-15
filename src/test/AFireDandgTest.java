import com.kedacom.ezFireAPI.Application;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by fudapeng on 2018/5/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class AFireDandgTest {
    @Autowired
    private WebApplicationContext wac;

    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void getXfdws() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/xfdw")
                .param("offset", "0").param("limit", "5")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

    @Test
    public void getAFireDandgByID() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/aFireDandg/1")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

    @Test
    public void postAFireDandg() throws Exception {
        mvc.perform(MockMvcRequestBuilders.post("/aFireDandg")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"bh\": \"123\", \"xh\": \"1\"}")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

    @Test
    public void putAFireDandg() throws Exception {
        mvc.perform(MockMvcRequestBuilders.put("/aFireDandg")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"bh\": \"123\", \"xh\": \"2\"}")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

    @Test
    public void deleteAFireDandg() throws Exception {
        mvc.perform(MockMvcRequestBuilders.delete("/aFireDandg")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"bh\": \"123\", \"xh\": \"abc\"}")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

}
