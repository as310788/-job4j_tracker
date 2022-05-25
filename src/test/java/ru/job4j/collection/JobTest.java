package ru.job4j.collection;

import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByNameSortByNameJobAToZ() {
        List<Job> jobs = Arrays.asList(
                new Job("Petrov", 2),
                new Job("Ivan", 3),
                new Job("Alexander", 1)
        );
        Collections.sort(jobs, new JobAscByName());
        assertThat(jobs.get(0).getName(), is("Alexander"));
    }

    @Test
    public void whenComparatorByNameSortByNameJobZToA() {
        List<Job> jobs = Arrays.asList(
                new Job("Petrov", 2),
                new Job("Ivan", 3),
                new Job("Alexander", 1)
        );
        Collections.sort(jobs, new JobDescByName());
        assertThat(jobs.get(0).getName(), is("Petrov"));
    }

    @Test
    public void whenComparatorByJobSortPriorityAscToDesc() {
        List<Job> jobs = Arrays.asList(
                new Job("Petrov", 2),
                new Job("Ivan", 3),
                new Job("Alexander", 1)
        );
        Collections.sort(jobs, new JobAscByPriority());
        assertThat(jobs.get(0).getName(), is("Alexander"));
    }

    @Test
    public void whenComparatorByJobSortPriorityDescToAsc() {
        List<Job> jobs = Arrays.asList(
                new Job("Petrov", 2),
                new Job("Ivan", 3),
                new Job("Alexander", 1)
        );
        Collections.sort(jobs, new JobDescByPriority());
        assertThat(jobs.get(0).getName(), is("Ivan"));
    }

    @Test
    public void whenComparatorCombo() {
        Comparator<Job> comb = new JobDescByNameLn()
                .thenComparing(new JobDescByName())
                .thenComparing(new JobDescByPriority());
        int rsl = comb.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}
