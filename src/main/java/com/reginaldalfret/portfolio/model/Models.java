package com.reginaldalfret.portfolio.model;

import java.util.List;

public class Models {
    public record Contribution(String org, String repo, String pr, String url, String key) {}
    public record Experience(String company, String role, String period, String location, List<String> bullets) {}
    public record Project(String title, String badge, String description, List<String> tags, List<String> bullets) {}
    public record Achievement(String icon, String title, String subtitle, String color) {}
    public record Certification(String icon, String title, String issuer, String color) {}
}
