package Controller;

import com.example.controller.AddController;
import com.example.utility.AddUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

//@WebMvcTest(AddController.class)
//public class AddControllerTest {
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private AddUtil addUtil;
//
//    @Test
//    public void testAddNumbers() throws Exception {
//        int a = 5;
//        int b = 3;
//        int expectedResult = 8;
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/add")
//                        .param("a", String.valueOf(a))
//                        .param("b", String.valueOf(b)))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content().string(String.valueOf(expectedResult)));
//    }
//}
