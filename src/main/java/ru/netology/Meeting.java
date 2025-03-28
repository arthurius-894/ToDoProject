package ru.netology;

public class Meeting extends Task {
    protected String topic;
    protected String project;
    protected String start;

    public Meeting(int id, String project, String topic, String start) {
        super(id);
        this.project = project;
        this.start = start;
        this.topic = topic;
    }

    public String getProject() {
        return project;
    }

    public String getStart() {
        return start;
    }

    public String getTopic() {
        return topic;
    }

    @Override
    public boolean matches(String query) {
        if (topic.contains(query)) {
            return true;
        }
        if (project.contains(query)) {
            return true;
        }
        return false;
    }
}
