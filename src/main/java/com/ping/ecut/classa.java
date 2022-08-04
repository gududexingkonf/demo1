package com.ping.ecut;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class classa {
    private int id;
    private int number;
    private List<student> students;
}
