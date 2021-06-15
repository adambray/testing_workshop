package history;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InMemoryRoundRepository {
    private Map<Long, Round> rounds = new HashMap<>();
    private Long maxId = 0L;

    public Round create(Round round) {
        long id = maxId + 1;
        maxId++;
        Round created = new Round(
                id,
                round.getPlayer1(),
                round.getPlayer2(),
                round.getResult()
        );
        rounds.put(id, created);
        return created;
    }

    public Round find(long id) {
        return rounds.get(id);
    }

    public List<Round> list() {
        return rounds.values().stream().collect(Collectors.toList());
    }

    public Round update(long id, Round round) {
        if (rounds.get(id) == null) {
            return null;
        }
        Round updated = new Round(
                id,
                round.getPlayer1(),
                round.getPlayer2(),
                round.getResult()
        );
        rounds.put(id, updated);

        return updated;
    }

    public void delete(long id) {
        rounds.remove(id);
    }
}