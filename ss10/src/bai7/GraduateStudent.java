package bai7;

// Lớp GraduateStudent (Sinh viên tốt nghiệp, kế thừa từ Student)
public class GraduateStudent extends Student {
    private String researchTopic;
    private String supervisorName;

    // Constructor đầy đủ tham số
    public GraduateStudent(String name, String id, double gpa, String researchTopic, String supervisorName) {
        super(name, id, gpa); // Gọi constructor của lớp cha
        if (researchTopic == null || researchTopic.trim().isEmpty() || supervisorName == null || supervisorName.trim().isEmpty()) {
            throw new IllegalArgumentException("Đề tài nghiên cứu và giảng viên hướng dẫn không được để trống!");
        }
        this.researchTopic = researchTopic;
        this.supervisorName = supervisorName;
    }

    // Getter và Setter
    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        if (researchTopic == null || researchTopic.trim().isEmpty()) {
            throw new IllegalArgumentException("Đề tài nghiên cứu không được để trống!");
        }
        this.researchTopic = researchTopic;
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        if (supervisorName == null || supervisorName.trim().isEmpty()) {
            throw new IllegalArgumentException("Tên giảng viên hướng dẫn không được để trống!");
        }
        this.supervisorName = supervisorName;
    }


    public String getDetails() {
        return super.getDetails() + " | Research Topic: " + researchTopic + " | Supervisor: " + supervisorName;
    }
}
