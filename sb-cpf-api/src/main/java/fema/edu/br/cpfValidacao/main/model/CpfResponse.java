package fema.edu.br.cpfValidacao.main.model;
public class CpfResponse {
    private String cpf;
    private String status;
    private boolean valid;
    private String digits;

    public CpfResponse(String cpf, String status, boolean valid) {
        this.cpf = cpf;
        this.status = status;
        this.valid = valid;
    }
    public CpfResponse(String cpf, String status, boolean valid, String digits) {
        this.cpf = cpf;
        this.status = status;
        this.valid = valid;
        this.digits = digits;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {

    this.cpf = cpf;
    }

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {

        this.status = status;
    }
    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getDigits() {
        return digits;
    }

    public void setDigits(String digits) {
        this.digits = digits;
    }
}
