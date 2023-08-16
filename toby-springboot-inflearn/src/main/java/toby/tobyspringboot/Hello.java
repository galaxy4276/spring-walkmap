package toby.tobyspringboot;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Hello {
    private final String name;
    private final int count;
}
