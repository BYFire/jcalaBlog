package me.jcala.blog.service.inter;

import me.jcala.blog.domain.Project;

import java.util.List;

/**
 * Created by Administrator on 2016/9/16.
 */
public interface ProjectSer {
    List<Project> getPros(int page);
    void savePro(Project project);
    List<Project> adminGetPros(int page);
    int adminGetPageNum();
    int getPageNum();
    void deletePro(int id);
    Project getProById(String idStr);
    void updatePro(Project project);
}
