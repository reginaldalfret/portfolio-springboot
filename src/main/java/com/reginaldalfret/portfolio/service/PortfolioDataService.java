package com.reginaldalfret.portfolio.service;

import com.reginaldalfret.portfolio.model.Models.*;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class PortfolioDataService {

    public List<Contribution> getContributions() {
        return List.of(
            new Contribution("Apple", "swift-numerics", "#355", "https://github.com/apple/swift-numerics/pull/355", "apple"),
            new Contribution("Google", "Highway", "#3511", "https://github.com/google/highway/pull/3511", "google"),
            new Contribution("Google Cloud", "Data Validator", "#1863", "https://github.com/GoogleCloudPlatform/professional-services-data-validator/pull/1863", "googlecloud"),
            new Contribution("Microsoft", "Semantic Kernel", "#14472", "https://github.com/microsoft/semantic-kernel/pull/14472", "microsoft"),
            new Contribution("AWS", "Lambda Powertools", "#8542", "https://github.com/aws-powertools/powertools-lambda-python/pull/8542", "aws"),
            new Contribution("Meta", "StyleX", "#1899", "https://github.com/facebook/stylex/pull/1899", "meta"),
            new Contribution("NVIDIA", "cuOpt", "#2068", "https://github.com/NVIDIA/cuopt/pull/2068", "nvidia"),
            new Contribution("NASA", "ProgPy", "#237", "https://github.com/nasa/prog_models/pull/237", "nasa"),
            new Contribution("Azure", "Cosmos DB Emulator", "#359", "https://github.com/Azure/azure-cosmos-db-emulator-docker/pull/359", "azure"),
            new Contribution("Adobe", "Skills", "#445", "https://github.com/adobe/skills/pull/445", "adobe"),
            new Contribution("Intel", "AutoRound", "#2421", "https://github.com/intel/auto-round/pull/2421", "intel"),
            new Contribution("IBM", "Docling Pipelines", "#85", "https://github.com/IBM/docling-pipelines/pull/85", "ibm"),
            new Contribution("Uber", "Kraken", "#716", "https://github.com/uber/kraken/pull/716", "uber"),
            new Contribution("Airbnb", "MagazineLayout", "#169", "https://github.com/airbnb/MagazineLayout/pull/169", "airbnb"),
            new Contribution("GitHub", "GitHub CLI", "#14592", "https://github.com/cli/cli/pull/14592", "github"),
            new Contribution("Dell", "Omnia Containers", "#649", "https://github.com/dell/omnia/pull/649", "dell"),
            new Contribution("Salesforce", "tough-cookie", "#659", "https://github.com/salesforce/tough-cookie/pull/659", "salesforce"),
            new Contribution("AMD", "ROCm HRX System", "#1231", "https://github.com/ROCm/hrx-system/pull/1231", "rocm"),
            new Contribution("SAP", "E-Mobility Simulator", "#2136", "https://github.com/SAP/e-mobility-charging-stations-simulator/pull/2136", "sap"),
            new Contribution("Pinterest", "PyMemcache", "#657", "https://github.com/pinterest/pymemcache/pull/657", "pinterest"),
            new Contribution("Qualcomm", "Commit Msg Check", "#38", "https://github.com/qualcomm/commit-msg-check-action/pull/38", "qualcomm"),
            new Contribution("Stripe", "Stripe React Native", "#2751", "https://github.com/stripe/stripe-react-native/pull/2751", "stripe"),
            new Contribution("Docker", "Docker Docs", "#26266", "https://github.com/docker/docs/pull/26266", "docker"),
            new Contribution("Apache", "HertzBeat", "#4410", "https://github.com/apache/hertzbeat/pull/4410", "apache"),
            new Contribution("Cloudflare", "CFSSL", "#1451", "https://github.com/cloudflare/cfssl/pull/1451", "cloudflare"),
            new Contribution("OpenAI", "Softnet", "#219", "https://github.com/openai/softnet/pull/219", "openai"),
            new Contribution("Snapchat", "ts-inject", "#30", "https://github.com/Snapchat/ts-inject/pull/30", "snapchat"),
            new Contribution("Spotify", "Confidence SDK Swift", "#272", "https://github.com/spotify/confidence-sdk-swift/pull/272", "spotify"),
            new Contribution("Cisco", "cJOSE", "#202", "https://github.com/cisco/cjose/pull/202", "cisco"),
            new Contribution("Netflix", "Atlas", "#2011", "https://github.com/Netflix/atlas/pull/2011", "netflix")
        );
    }

    public List<Experience> getExperiences() {
        return List.of(
            new Experience(
                "DailyGurus",
                "Software Developer",
                "Jul 2026 – Present",
                "Chennai, India",
                List.of(
                    "Worked on ERPNext, contributing to module customizations, workflows and application development.",
                    "Developing a full ERP software platform from scratch across frontend, backend, database and business logic layers.",
                    "Building web applications and REST APIs with React.js, Node.js and TypeScript for scalable, reliable systems."
                )
            ),
            new Experience(
                "Data Patterns",
                "Data Science Intern",
                "May 2025 – Jun 2025",
                "Chennai, India",
                List.of(
                    "Built Python web-scraping tools to collect aerospace research papers and technical data from IEEE sources.",
                    "Curated the data and fine-tuned an LLM using LoRA (Low-Rank Adaptation) on the domain-specific dataset."
                )
            )
        );
    }

    public List<Project> getProjects() {
        return List.of(
            new Project(
                "301 Super AI Agents — Sovereign Multi-Agent AI Platform",
                "1st · HackIndia 2026 (500+ Teams)",
                "Local-first multi-agent AI platform with 301 specialised agents for real-world task automation.",
                List.of("Python", "LLMs (Ollama)", "Agent Orchestration", "FastAPI", "React.js", "OCR", "Workflow Automation"),
                List.of(
                    "Designed a multi-agent platform with 301 specialised agents coordinated by a central Agent 301.",
                    "Implemented local model selection, OCR document parsing, real-time streaming and automation.",
                    "Built an interface supporting offline, on-device inference for privacy-sensitive environments."
                )
            ),
            new Project(
                "TOR-UNVEIL — Dark Web AI Cybercriminal Tracker",
                "1st · TN Police Hackathon 2025",
                "Full-stack AI platform adapted for live operational use by Tamil Nadu Police.",
                List.of("Python", "React.js", "Node.js", "Tailwind CSS", "Machine Learning", "Data Analytics"),
                List.of(
                    "Built a platform for real-time cybercriminal identification and network profiling on TOR dark web.",
                    "Developed search, suspect profile cards and network-graph visualisations with ML classification."
                )
            ),
            new Project(
                "AI Crop Recommendation & Agri-Intelligence Engine",
                "1st · Blaze a Trail 2.0",
                "ML-powered recommendation system for precision farming.",
                List.of("Python", "Machine Learning", "React.js", "REST APIs", "GIS Data", "Explainable AI"),
                List.of(
                    "Built an ML engine using soil, weather and GIS datasets to deliver actionable farming insights.",
                    "Integrated REST API backend with React.js dashboard; applied Explainable AI for accessibility."
                )
            )
        );
    }

    public Map<String, List<String>> getSkills() {
        Map<String, List<String>> skills = new LinkedHashMap<>();
        skills.put("ai", List.of("Machine Learning", "Deep Learning", "LLMs", "LoRA", "Prompt Engineering", "OCR", "Computer Vision", "Explainable AI", "Scikit-learn", "Data Analytics"));
        skills.put("languages", List.of("Java (JDK 21)", "Python", "JavaScript (ES6+)", "TypeScript", "SQL", "HTML5", "CSS3", "Go", "Swift", "C++"));
        skills.put("opensource", List.of("Git", "GitHub", "Pull Requests", "Code Review", "Bug Fixing", "Regression Testing", "Documentation", "CVE Fixes"));
        skills.put("dev", List.of("Spring Boot 3", "Spring MVC", "Thymeleaf", "React.js", "Node.js", "Express.js", "FastAPI", "REST APIs", "Tailwind CSS", "ERPNext"));
        skills.put("databases", List.of("PostgreSQL", "MySQL", "MongoDB"));
        skills.put("tools", List.of("Maven", "Docker", "AWS", "Linux", "Postman", "Figma", "VS Code"));
        return skills;
    }

    public List<Achievement> getAchievements() {
        return List.of(
            new Achievement("🥇", "1st – HackIndia 2026", "(301 Super AI Agents)", "text-amber-400"),
            new Achievement("🥇", "1st – TN Police Hackathon 2025", "(TOR-UNVEIL)", "text-amber-400"),
            new Achievement("🥇", "1st – Blaze a Trail 2.0", "(Crop Recommendation)", "text-amber-400"),
            new Achievement("🛡️", "Finalist – TN Police Hackathon 2024", "", "text-sky-400"),
            new Achievement("🏆", "Winner – 6 National-Level Technical Symposiums", "", "text-purple-400"),
            new Achievement("🚀", "70+ other projects", "across AI, Web & Automation", "text-cyan-400")
        );
    }

    public List<Certification> getCertifications() {
        return List.of(
            new Certification("🎓", "Meta Front-End Developer", "Coursera", "text-blue-400"),
            new Certification("🛡️", "Google Cybersecurity Certificate", "Coursera", "text-emerald-400"),
            new Certification("⚛️", "React: The Complete Guide", "Udemy", "text-cyan-400"),
            new Certification("🎨", "Figma UI/UX Design Essentials", "Udemy", "text-pink-400")
        );
    }
}
