fun translate(rna: String?): List<String> {
    if (rna == null) return emptyList()

    val codonMap = mapOf(
        "AUG" to "Methionine",
        "UUU" to "Phenylalanine",
        "UUC" to "Phenylalanine",
        "UUA" to "Leucine",
        "UUG" to "Leucine",
        "UCU" to "Serine",
        "UCC" to "Serine",
        "UCA" to "Serine",
        "UCG" to "Serine",
        "UAU" to "Tyrosine",
        "UAC" to "Tyrosine",
        "UGU" to "Cysteine",
        "UGC" to "Cysteine",
        "UGG" to "Tryptophan"
    )

    val stopCodons = setOf("UAA", "UAG", "UGA")
    val proteins = mutableListOf<String>()

    var i = 0
    while (i < rna.length) {
        if (i + 3 > rna.length) {
            throw IllegalArgumentException()
        }

        val codon = rna.substring(i, i + 3)

        if (codon in stopCodons) break

        val protein = codonMap[codon]
            ?: throw IllegalArgumentException()

        proteins.add(protein)
        i += 3
    }

    return proteins
}

