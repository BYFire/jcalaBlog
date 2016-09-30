package me.jcala.blog.service.inter;

import me.jcala.blog.domain.Info;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2016/9/8.
 */
public interface InfoSer {
    Info getInfo();
    boolean login(Info info);
    int modifyPw(String oldPass,String newPass);
    boolean updateInfo(Info info);
    boolean checkPass(String oldPass);
    void addSession(HttpServletRequest request, Info info);
    void destroySession(HttpServletRequest request);
    String getResumeMd();
    boolean saveResume(Info info);
    void updateAvatar(String avater);
    String getResumeView();
}
