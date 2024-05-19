package lesson_2.task_2_3;

import lombok.AllArgsConstructor;

public class Computer {

    @AllArgsConstructor
    static class Processor {

        private String model;

        public String getDetails() {
            return "Model of the processor is " + this.model;
        }
    }

    @AllArgsConstructor
    class RAM {

        private Integer size;

        public String getDetails() {
            return "Size of the RAM is " + this.size + " GB";
        }
    }
}
