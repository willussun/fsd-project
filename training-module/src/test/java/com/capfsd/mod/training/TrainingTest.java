package com.capfsd.mod.training;

import com.capfsd.mod.training.dto.PageDto;
import com.capfsd.mod.training.dto.TechnologyDto;
import com.capfsd.mod.training.dto.TrainingDto;
import com.capfsd.mod.training.dto.UserDto;
import com.capfsd.mod.training.entity.Training;
import com.capfsd.mod.training.repository.TrainingRepository;
import com.capfsd.mod.training.service.ITrainingService;
import com.capfsd.mod.training.util.ResponseResult;
import com.capfsd.mod.training.vo.TrainingVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.data.domain.Page;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.*;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TrainingTest {

    @Autowired
    private TrainingRepository trainingRepository;
    @Autowired
    private ITrainingService trainingService;

    @Test
    public void test1() {
        assertNotNull(trainingRepository);
        Training training = new Training();
        training.setStatus("New");
        training = trainingRepository.save(training);
        System.out.println(training.getStatus());
    }

    @Test
    public void test2() {
        assertNotNull(trainingRepository);
        List<Training> trainings = trainingRepository.findAll();
        System.out.println(trainings.size());
    }


    @Test
    public void test3() {
        assertNotNull(trainingRepository);
        Training training = (trainingRepository.findById(1L)).get();
        System.out.println(training.getSkillId());
    }

    @Test
    public void test4() {
        assertNotNull(trainingRepository);
        assertNotNull(trainingService);
        trainingService.completeTraining(1L);
    }

    @Test
    public void test5() {
        assertNotNull(trainingRepository);
        assertNotNull(trainingService);
        trainingService.confirmTraining(1L);
    }

    @Test
    public void test6() {
        TrainingVo trainingVo= new TrainingVo();
        trainingVo.setAmountReceived(100F);
        trainingVo.setAvgRating(50F);
        trainingVo.setCommissionAmount(1000F);
        trainingVo.setEndDate("2020-01-01");
        trainingVo.setEndTime("23:00:00");
        trainingVo.setStartDate("2019-01-01");
        trainingVo.setStartTime("00:00:00");
        trainingVo.setRating(3);
        trainingVo.setSkillId(1L);
        trainingVo.setUserId(2L);

        assertNotNull(trainingVo);
        trainingService.proposeTraining(trainingVo);
    }

    @Test
    public void test7() {
        TrainingVo trainingVo = new TrainingVo();
        trainingVo.setAmountReceived(100F);
        trainingVo.setAvgRating(50F);
        trainingVo.setCommissionAmount(1000F);
        trainingVo.setEndDate("2020-01-01");
        trainingVo.setEndTime("23:00:00");
        trainingVo.setStartDate("2019-01-01");
        trainingVo.setStartTime("00:00:00");
        trainingVo.setRating(3);
        trainingVo.setSkillId(1L);
        trainingVo.setUserId(2L);
        Optional<TrainingDto> trainingOpt = trainingService.getTrainingById(trainingVo.getUserId());
        TrainingDto trainingDto = trainingOpt.get();
        Pageable pageable = null;
        trainingService.getCompletedTrainings(pageable);
    }

    @Test
    public void test8() {
        TrainingVo trainingVo = new TrainingVo();
        trainingVo.setAmountReceived(100F);
        trainingVo.setAvgRating(50F);
        trainingVo.setCommissionAmount(1000F);
        trainingVo.setEndDate("2020-01-01");
        trainingVo.setEndTime("23:00:00");
        trainingVo.setStartDate("2019-01-01");
        trainingVo.setStartTime("00:00:00");
        trainingVo.setRating(3);
        trainingVo.setSkillId(1L);
        trainingVo.setUserId(2L);
        Optional<TrainingDto> trainingOpt = trainingService.getTrainingById(trainingVo.getUserId());
        TrainingDto trainingDto = trainingOpt.get();
        Pageable pageable = null;
        trainingService.getCompletedTrainings(pageable);
        assertNotNull(trainingDto);
        assertNotNull(trainingDto.getAmountReceived());
        assertNotNull(trainingDto.getAvgRating());
        assertNotNull(trainingDto.getCommissionAmount());
        assertNotNull(trainingDto.getEndDate());
        assertNotNull(trainingDto.getEndTime());
        assertNotNull(trainingDto.getId());
        assertNotNull(trainingDto.getMentorId());
        assertNotNull(trainingDto.getMentorName());
        assertNotNull(trainingDto.getProgress());
        assertNotNull(trainingDto.getRating());
        assertNotNull(trainingDto.getSkillId());
        assertNotNull((trainingDto.getSkillName()));
        assertNotNull((trainingDto.getStartDate()));
        assertNotNull((trainingDto.getStartTime()));
        assertNotNull((trainingDto.getStatus()));
        assertNotNull((trainingDto.getUserId()));
        assertNotNull((trainingDto.getUserName()));
    }

    @Test
    public void test9() {
        TrainingVo trainingVo = new TrainingVo();
        trainingVo.setAmountReceived(100F);
        trainingVo.setAvgRating(50F);
        trainingVo.setCommissionAmount(1000F);
        trainingVo.setEndDate("2020-01-01");
        trainingVo.setEndTime("23:00:00");
        trainingVo.setStartDate("2019-01-01");
        trainingVo.setStartTime("00:00:00");
        trainingVo.setRating(3);
        trainingVo.setSkillId(1L);
        trainingVo.setUserId(2L);
        Optional<TrainingDto> trainingOpt = trainingService.getTrainingById(trainingVo.getUserId());
        TrainingDto trainingDto = trainingOpt.get();
        Pageable pageable = null;
        trainingService.getInprogressTrainings(pageable);
    }

    @Test
    public void test10() {
       UserDto userDto = new UserDto();
       userDto.setFirstName("aaa");
       userDto.setId(5L);
       userDto.setLastName("bbb");
       userDto.setUsername("ccc");
       assertNotNull(userDto.getFirstName());
       assertNotNull(userDto.getId());
       assertNotNull(userDto.getLastName());
       assertNotNull(userDto.getUsername());
    }

    @Test
    public void test11() throws MalformedURLException {
            URL restURL = new URL("http://localhost:8030/api/v1/trainings/2");
            try {
                HttpURLConnection conn = (HttpURLConnection) restURL.openConnection();
                conn.setRequestMethod("GET"); // POST GET PUT DELETE
                conn.setRequestProperty("Accept", "application/json");
                BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                br.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }

    @Test
    public void test12() {
        assertNotNull(trainingRepository);
        TrainingVo trainingVo = new TrainingVo();
        trainingVo.setAmountReceived(100F);
        trainingVo.setAvgRating(50F);
        trainingVo.setCommissionAmount(1000F);
        trainingVo.setEndDate("2020-01-01");
        trainingVo.setEndTime("23:00:00");
        trainingVo.setStartDate("2019-01-01");
        trainingVo.setStartTime("00:00:00");
        trainingVo.setRating(3);
        trainingVo.setSkillId(1L);
        trainingVo.setUserId(2L);
        Map<String, Object> map = new HashMap<String, Object>();
        map.entrySet();
        ResponseResult<TrainingVo> rs = new ResponseResult<TrainingVo>(200, "success", trainingVo, map);
        rs.setCode(1);
        rs.setData(trainingVo);
        rs.setExtraInfo(null);
        rs.setMessage("200");
        rs.getExtraInfo();
        assertNotNull(rs.getMessage());
        assertNotNull(rs.getCode());
        assertNotNull(rs.getData());
        assertNotNull(rs);
        ResponseResult.fail("The result is fail", null);
        ResponseResult.success("The result is fail", rs, null);
    }

        @Test
    public void test13() {
        PageDto<Training> pageDto = new PageDto<Training>();
        assertNotNull(trainingRepository);
        List<Training> trainings = trainingRepository.findAll();
        System.out.println(trainings.size());
        pageDto.setList(trainings);
        pageDto.setTotal(5);
        assertNotNull(pageDto.getList());
        assertNotNull(pageDto.getTotal());
        TechnologyDto tDto = new TechnologyDto();
        tDto.setId(1L);
        tDto.setName("aaa");
        assertNotNull(tDto.getId());
        assertNotNull(tDto.getName());
    }
}
