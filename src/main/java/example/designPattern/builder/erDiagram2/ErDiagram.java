package example.designPattern.builder.erDiagram2;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

class ErDiagram {

	private List<String> entities;
	private List<ErDiagramBuilder.Relationship> relationships;

	ErDiagram(ErDiagramBuilder builder) {
		super();

		this.entities = builder.entities;
		this.relationships = builder.relationships;
	}

	List<String> getEntities() {
		return entities;
	}

	List<ErDiagramBuilder.Relationship> getRelationships() {
		return relationships;
	}

	@Override
	public String toString() {
		return "ErDiagram [entities=" + entities + ", relationships=" + relationships + "]";
	}

	static class ErDiagramBuilder {

		class Relationship {
			String from;
			String to;
			String name;

			public String toString() {
				return "Relationship [from=" + from + ", to=" + to + ", name=" + name + "]";
			}

			Relationship(String from, String to, String name) {
				super();

				this.from = from;
				this.to = to;
				this.name = name;
			}
		}

		private List<String> entities;
		private List<Relationship> relationships;

		ErDiagramBuilder() {
			entities = new LinkedList<String>();
			relationships = new LinkedList<Relationship>();
		}

		ErDiagramBuilder addEntity(String name) {
			entities.add(name);

			return this;
		}

		ErDiagramBuilder addRelationship(String from, String to, String name) {
			relationships.add(new Relationship(from, to, name));

			return this;
		}

		ErDiagramBuilder addCardMin(String entity, String relation, String value) {
			return this;
		}

		ErDiagram build() throws InvalidDiagramException {
			ErDiagram erDiagram = new ErDiagram(this);
			validateErDiagram(erDiagram);

			return erDiagram;
		}

		@SuppressWarnings("serial")
		class InvalidDiagramException extends Exception {
			String entity;

			InvalidDiagramException(String entity) {
				super();

				this.entity = entity;
			}

			@Override
			public String toString() {
				return "InvalidDiagramException [entity=" + entity + "]";
			}
		}

		@FunctionalInterface
		public interface ValidateConsumer<T> extends Consumer<T> {

			@Override
			default void accept(final T elem) {
				try {
					validate(elem);
				} catch (final InvalidDiagramException e) {
					throw new RuntimeException(e);
				}
			}

			void validate(T elem) throws InvalidDiagramException;
		}

		private void validateErDiagram(ErDiagram erDiagram) throws InvalidDiagramException {
			// Do some basic validations to check
			// if ErDiagram object does not break any assumption of system

			/*
			 * For instance check that Relationship is related to existing entities
			 */
			erDiagram.relationships.forEach((ValidateConsumer<Relationship>) r -> {
				if (!erDiagram.entities.contains(r.from))
					throw new InvalidDiagramException(r.from);
				if (!erDiagram.entities.contains(r.to))
					throw new InvalidDiagramException(r.to);
			});
		}
	}
}
