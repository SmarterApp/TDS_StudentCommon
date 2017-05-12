package tds.student.sql.data;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

public class AccListSerializationTest {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @Test
    public void itShouldSerializeAndDeserializeData() throws Exception {
        final AccList accList = new AccList();
        accList.add(data());
        accList.add(data());
        final List<Dependency> dependencyList = new ArrayList<>();
        dependencyList.add(dependency());
        dependencyList.add(dependency());
        accList.setDependencies(dependencyList);

        final String serialized = OBJECT_MAPPER.writeValueAsString(accList);
        System.out.println(serialized);
        final AccList deserialized = OBJECT_MAPPER.readValue(serialized, AccList.class);

        assertThat(deserialized.getData()).hasSameSizeAs(accList.getData());
        assertThat(deserialized.getData().get(0).getCode())
            .isEqualTo(accList.getData().get(0).getCode());
        assertThat(deserialized.getData().get(1).getCode())
            .isEqualTo(accList.getData().get(1).getCode());

        assertThat(deserialized.getDependencies()).hasSameSizeAs(accList.getDependencies());
        assertThat(deserialized.getDependencies().get(0).getContextType())
            .isEqualTo(accList.getDependencies().get(0).getContextType());
        assertThat(deserialized.getDependencies().get(1).getContextType())
            .isEqualTo(accList.getDependencies().get(1).getContextType());
    }

    @Test
    public void itShouldSerializeAndDeserializeDataWithTypeInfo() throws Exception {
        final AccList accList = new AccList();
        accList.add(data());
        accList.add(data());
        final List<Dependency> dependencyList = new ArrayList<>();
        dependencyList.add(dependency());
        dependencyList.add(dependency());
        accList.setDependencies(dependencyList);

        OBJECT_MAPPER.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL, JsonTypeInfo.As.PROPERTY);
        try {
            final String serialized = OBJECT_MAPPER.writeValueAsString(accList);
            System.out.println(serialized);
            final AccList deserialized = OBJECT_MAPPER.readValue(serialized, AccList.class);

            assertThat(deserialized.getData()).hasSameSizeAs(accList.getData());
            assertThat(deserialized.getData().get(0).getCode())
                .isEqualTo(accList.getData().get(0).getCode());
            assertThat(deserialized.getData().get(1).getCode())
                .isEqualTo(accList.getData().get(1).getCode());

            assertThat(deserialized.getDependencies()).hasSameSizeAs(accList.getDependencies());
            assertThat(deserialized.getDependencies().get(0).getContextType())
                .isEqualTo(accList.getDependencies().get(0).getContextType());
            assertThat(deserialized.getDependencies().get(1).getContextType())
                .isEqualTo(accList.getDependencies().get(1).getContextType());
        } finally {
            OBJECT_MAPPER.disableDefaultTyping();
        }
    }

    private Data data() {
        final Data data = new Data();
        data.setSegmentPosition((int) (Math.random() * 1000));
        data.setCode(UUID.randomUUID().toString());
        return data;
    }

    private Dependency dependency() {
        final Dependency dependency = new Dependency();
        dependency.setContext("context");
        dependency.setContextType(UUID.randomUUID().toString());
        return dependency;
    }
}